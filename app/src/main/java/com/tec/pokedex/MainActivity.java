package com.tec.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView pokeList;
    ArrayList<Pokemon> listaPokemones = new ArrayList();
    private void agregarPokemones(){
        listaPokemones.add(new Pokemon("Bulbausaur","Planta", "Veneno", "Desde que nace, crece alimentándose de los nutrientes que contiene la semilla de su lomo."));
        listaPokemones.add(new Pokemon("Ivysaur", "Planta", "Veneno","La luz del sol lo fortalece y hace que le crezca el capullo que tiene en el lomo."));
        listaPokemones.add(new Pokemon("Venusaur","Planta", "Veneno", "La flor que tiene en el lomo libera un delicado aroma, que tiene un efecto relajante en combate."));
        listaPokemones.add(new Pokemon("Charmander", "Fuego", "", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola."));
        listaPokemones.add(new Pokemon("Charmeleon","Fuego", "", "Si se exalta en combate, expulsa intensas llamaradas que incineran todo a su alrededor."));
        listaPokemones.add(new Pokemon("Charizard","Fuego","Volador","Se dice que el fuego de Charizard arde con más fuerza cuantas más duras batallas haya vivido."));
        listaPokemones.add(new Pokemon("Squirtle","Agua","","Cuando se siente en peligro, se esconde en su caparazón y escupe chorros de agua por la boca."));
        listaPokemones.add(new Pokemon("Wartortle","Agua","","Utiliza hábilmente sus peludas orejas y la cola para mantener el equilibrio al nadar."));
        listaPokemones.add(new Pokemon("Blastoise","Agua","","Para acabar con su enemigo, lo aplasta con el peso de su cuerpo. En momentos de apuro, se esconde en el caparazón."));
        listaPokemones.add(new Pokemon("Caterpie","Bicho","","Sus cortas patas están recubiertas de ventosas que le permiten subir incansable por muros y cuestas."));
        listaPokemones.add(new Pokemon("Metapod","Bicho","","Como en este estado solo puede endurecer su coraza, permanece inmóvil a la espera de evolucionar."));
        listaPokemones.add(new Pokemon("Butterfree","Bicho", "Volador", "Adora el néctar de las flores. Una pequeña cantidad de polen le basta para localizar prados floridos."));
        listaPokemones.add(new Pokemon("Pikachu","Electrico","","Cuando se enfada, este Pokémon descarga la energía que almacena en el interior de las bolsas de las mejillas."));
        listaPokemones.add(new Pokemon("Raichu","Electrico","","Si las bolsas de sus mejillas se cargan por completo de electricidad, se le ponen las orejas de punta."));
        listaPokemones.add(new Pokemon("Psyduck","Agua","","Padece continuamente dolores de cabeza. Cuando son muy fuertes, empieza a usar misteriosos poderes."));
        listaPokemones.add(new Pokemon("Slowpoke", "Agua","Psíquico","Está siempre en su mundo, pero nadie sabe en qué piensa. Suele pescar con la cola."));
        listaPokemones.add(new Pokemon("Slowbro","Agua","Psíquico","Según parece, cuando Slowpoke fue a pescar al mar, un Shellder le mordió la cola y así evolucionó a Slowbro."));
        listaPokemones.add(new Pokemon("Seel","Agua","","Le encantan los lugares gélidos y disfruta nadando en aguas a temperaturas en torno a los -10 ºC."));
        listaPokemones.add(new Pokemon("Dewgong","Agua","Hielo","Su cuerpo es blanco como la nieve. Puede nadar plácidamente en mares gélidos gracias a su resistencia al frío."));
        listaPokemones.add(new Pokemon("Gengar","Fantasma","Veneno","Para quitarle la vida a su presa, se desliza en su sombra y espera su oportunidad en silencio."));
        listaPokemones.add(new Pokemon("Cubone","Tierra","","Cuando llora al acordarse de su madre fallecida, su llanto resuena en el cráneo que lleva en la cabeza."));
        listaPokemones.add(new Pokemon("Marowak","Tierra","","Ha evolucionado tras fortalecerse y superar su pena. Ahora lucha con arrojo blandiendo su hueso a modo de arma."));
        listaPokemones.add(new Pokemon("Horsea","Agua","","Nada con la gracilidad de un bailarín, creando remolinos a su paso, y juega con sus congéneres a ver quién forma el más grande."));
        listaPokemones.add(new Pokemon("Seadra","Agua","","Su estrecho morro posee tal fuerza de succión que es capaz de aspirar presas de mayor tamaño y engullirlas enteras."));
        listaPokemones.add(new Pokemon("MrMime","Psíquico","Hada","Un experto de la pantomima capaz de crear paredes invisibles pero sólidas solo con sus gestos."));
        listaPokemones.add(new Pokemon("Gyarados","Agua","Volador","Cuando aparece, monta en cólera. No deja de estar furioso hasta que lo destruye todo."));
        listaPokemones.add(new Pokemon("Lapras","Agua","Hielo","Le encanta surcar los mares con gente y Pokémon sobre el lomo. Entiende el lenguaje humano."));
        listaPokemones.add(new Pokemon("Snorlax","Normal","","Su estómago puede digerir todo tipo de comida, incluso si está podrida o mohosa."));
        listaPokemones.add(new Pokemon("Dragonite","Dragon","Volador"," pesar del tamaño que tiene y de lo pesado que es, puede volar. Es capaz de dar la vuelta al mundo en solo 16 horas."));
        listaPokemones.add(new Pokemon("Mewtwo","Psíquico","","Su ADN es casi el mismo que el de Mew. Sin embargo, su tamaño y carácter son muy diferentes."));
        listaPokemones.add(new Pokemon("Mew","Psíquico","","Si se observa a través de un microscopio, puede distinguirse cuán corto, fino y delicado es el pelaje de este Pokémon."));
        listaPokemones.add(new Pokemon("Totodile","Agua","","Totodile tiene cuerpo pequeño, pero fuertes mandíbulas. A veces, piensa que solo está dando un mordisquito y hace unas heridas bastante considerables."));
        listaPokemones.add(new Pokemon("Marill","Agua","Hada","Tiene un pelaje que repele el agua, por lo que está seco incluso después de bañarse."));
        listaPokemones.add(new Pokemon("Azumarill","Agua","Hada","Sus largas orejas son unos sensores excepcionales que le permiten diferenciar e identificar lo que oye dentro del agua."));
        listaPokemones.add(new Pokemon("Swinub","Hielo","Tierra","Si percibe un aroma tentador, se lanza de cabeza sin pensárselo dos veces para hallar su origen."));
        listaPokemones.add(new Pokemon("Phanpy","Tierra","","Es mucho más fuerte de lo que aparenta. Un trompazo accidental podría fracturarle los huesos del brazo a una persona."));
        listaPokemones.add(new Pokemon("Azurill","Normal","Hada","Rebota como una pelota. Para luchar contra enemigos más grandes, agita la cola en el aire."));
        listaPokemones.add(new Pokemon("Absol","Siniestro","","Corre por montañas y prados a la velocidad del viento. Su cuerno curvado tiene tal sensibilidad que puede predecir catástrofes naturales."));
        listaPokemones.add(new Pokemon("Spheal","Hielo","Agua","Flota entre las olas para examinar el océano. Si encuentra una presa, avisa enseguida a los Walrein de su manada."));
        listaPokemones.add(new Pokemon("Sealeo","Hielo","Agua","Vive sobre placas de hielo. Detecta el olor de sus presas mientras nada."));
        listaPokemones.add(new Pokemon("Piplup","Agua","","No le gusta que lo cuiden. Como no aprecia el apoyo de su Entrenador, le cuesta coger confianza con él."));
        listaPokemones.add(new Pokemon("Munchlax","Normal","","Guarda alimentos bajo el pelaje. Compartirá un pequeño bocado de vez en cuando con quien logre ganarse su confianza."));
        listaPokemones.add(new Pokemon("Riolu","Lucha","","Se comunica con los suyos emitiendo ondas. Puede pasarse toda una noche corriendo."));
        listaPokemones.add(new Pokemon("Lucario","Lucha","Acero","Dicen que, como es capaz de detectar auras, puede percibir a sus rivales aunque no los vea."));
        listaPokemones.add(new Pokemon("Leafeon","Planta","","En días soleados, duerme y hace la fotosíntesis, con la que emite aire puro a su alrededor."));
        listaPokemones.add(new Pokemon("Glaceon","Hielo","","Controla a su antojo la temperatura corporal y congela las partículas de agua que flotan en el aire para provocar ráfagas de nieve en polvo."));
        listaPokemones.add(new Pokemon("Mamoswine","Tierra","Hielo","Es tan fuerte como parece. Cuanto más frío hace, más gruesos, largos e imponentes se vuelven sus colmillos de hielo."));
        listaPokemones.add(new Pokemon("Ducklett","Agua","Volador","Nada a mayor velocidad de la que puede volar. Se sumerge en el agua para buscar musgo acuático, su comida favorita."));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregarPokemones();
        pokeList = findViewById(R.id.pokeList);
        pokeList.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        pokeList.setAdapter(new PokeListAdapter(listaPokemones, MainActivity.this));

    }
}