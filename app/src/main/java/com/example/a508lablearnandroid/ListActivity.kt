package com.example.a508lablearnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a508lablearnandroid.ui.theme._508LabLearnAndroidTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListScreen()
        }
    }
}

@Composable
fun ListScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFB00000))
        .padding(16.dp)
    ) {
        Column(modifier = Modifier.background(Color.Gray)
            .padding(16.dp)
            .fillMaxSize()
        ) {
            LazyColumn() {
                items(allKantoPokemon.size) {index ->
                    val item = allKantoPokemon[index]
                    Text(text = item.name)
                }
            }
        }
    }
}
@Composable
fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFF1E88E5), CircleShape)
        )

        Spacer(modifier = Modifier.width(12.dp))

        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Fill pokemon name or ID") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFF8B0000),
                unfocusedContainerColor = Color(0xFF8B0000),
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

data class Pokemon(
    val name: String,
    val number: Int
)

val allKantoPokemon = listOf(
    Pokemon("Bulbasaur", 1),
    Pokemon("Ivysaur", 2),
    Pokemon("Venusaur", 3),
    Pokemon("Charmander", 4),
    Pokemon("Charmeleon", 5),
    Pokemon("Charizard", 6),
    Pokemon("Squirtle", 7),
    Pokemon("Wartortle", 8),
    Pokemon("Blastoise", 9),
    Pokemon("Caterpie", 10),
    Pokemon("Metapod", 11),
    Pokemon("Butterfree", 12),
    Pokemon("Weedle", 13),
    Pokemon("Kakuna", 14),
    Pokemon("Beedrill", 15),
    Pokemon("Pidgey", 16),
    Pokemon("Pidgeotto", 17),
    Pokemon("Pidgeot", 18),
    Pokemon("Rattata", 19),
    Pokemon("Raticate", 20),
    Pokemon("Spearow", 21),
    Pokemon("Fearow", 22),
    Pokemon("Ekans", 23),
    Pokemon("Arbok", 24),
    Pokemon("Pikachu", 25),
    Pokemon("Raichu", 26),
    Pokemon("Sandshrew", 27),
    Pokemon("Sandslash", 28),
    Pokemon("Nidoran♀", 29),
    Pokemon("Nidorina", 30),
    Pokemon("Nidoqueen", 31),
    Pokemon("Nidoran♂", 32),
    Pokemon("Nidorino", 33),
    Pokemon("Nidoking", 34),
    Pokemon("Clefairy", 35),
)

// Tips: for image : https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/firered-leafgreen/1.png
@Preview(showBackground = true)
@Composable
fun ListPreview() {
    ListScreen()
}