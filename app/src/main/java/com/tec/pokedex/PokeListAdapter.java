package com.tec.pokedex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokeListAdapter extends RecyclerView.Adapter<PokeListAdapter.ViewHolderPokemon> {

    private ArrayList<Pokemon> pokeList;
    private Context context;

    public PokeListAdapter(ArrayList<Pokemon> pokeList, Context context) {
        this.pokeList = pokeList;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolderPokemon onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolderPokemon(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPokemon holder, int position) {
        Pokemon pokemonActual = pokeList.get(position);

        holder.textViewNombre.setText(pokemonActual.getNombre());
        holder.textViewTipo1.setText(pokemonActual.getTipo1());

        if (!pokemonActual.getTipo2().isEmpty()) {
            holder.textViewTipo2.setText(pokemonActual.getTipo2());
        } else {
            holder.cardViewTipo2.setVisibility(View.INVISIBLE);
        }

        darColorACard(pokemonActual.getTipo1(), holder.cardViewTotal);

        String rutaImagen = "@drawable/" + pokemonActual.getNombre().toLowerCase();
        int imageRecurso = context.getResources().getIdentifier(rutaImagen, null, context.getPackageName());
        holder.imageViewPokemon.setImageResource(imageRecurso);
        holder.cardViewTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantalla = new Intent(context, InformacionActivity.class);
                cambioPantalla.putExtra("nombre_pokemon", pokemonActual.getNombre());
                context.startActivity(cambioPantalla);

            }
        });
    }

    private void darColorACard(String tipoPokemon, CardView cartaPokemon) {
        switch (tipoPokemon) {
            case "Fuego":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_fuego));
                break;
            case "Agua":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_agua));
                break;
            case "Planta":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_planta));
                break;
            case "Bicho":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_bicho));
                break;
            case "Electrico":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_electrico));
                break;
            case "Fantasma":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_fantasma));
                break;
            case "Tierra":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_tierra));
                break;
            case "Psíquico":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_psiquico));
                break;
            case "Normal":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_normal));
                break;
            case "Dragon":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_dragon));
                break;
            case "Hielo":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_hielo));
                break;
            case "Siniestro":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_siniestro));
                break;
            case "Lucha":
                cartaPokemon.setCardBackgroundColor(context.getColor(R.color.tipo_lucha));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return pokeList.size();
    }

    public static class ViewHolderPokemon extends RecyclerView.ViewHolder {
        private final TextView textViewNombre, textViewTipo1, textViewTipo2;
        private final CardView cardViewTipo2, cardViewTotal;
        private final ImageView imageViewPokemon;

        public ViewHolderPokemon(@NonNull View itemView) {
            super(itemView);
            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewTipo1 = itemView.findViewById(R.id.textViewTipo1);
            textViewTipo2 = itemView.findViewById(R.id.textViewTipo2);
            cardViewTipo2 = itemView.findViewById(R.id.cardViewTipo2);
            cardViewTotal = itemView.findViewById(R.id.cardViewTotal);
            imageViewPokemon = itemView.findViewById(R.id.imageViewPokemon);
        }
    }
}
