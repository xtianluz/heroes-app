package com.example.super_heroes_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.super_heroes_app.model.Hero
import com.example.super_heroes_app.model.HeroesRepo
import com.example.super_heroes_app.model.HeroesRepo.heroes
import com.example.super_heroes_app.ui.theme.HeroesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesAppTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HeroesApp()
                }
            }
        }
    }
}

@Composable
fun HeroesApp(){
    Scaffold(
        topBar = { HeroTopBar() }
    ) {
        LazyColumn(){
            items(heroes) {
                HeroItem(heroes = it)
            }
        }
    }
}

@Composable
fun HeroItem(heroes: Hero){
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .size(72.dp)
        ){
            Column(){
                Text(
                    text = stringResource(heroes.nameRes),
                    style = MaterialTheme.typography.h3
                )
                Text(
                    text = stringResource(heroes.descriptionRes),
                    style = MaterialTheme.typography.body2,
                    maxLines = 2,
                    modifier = Modifier
                        .size(230.dp)
                )
            }
            Spacer(Modifier.weight(1f))
            Image(painter = painterResource(heroes.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(10))
            )
        }
    }
}

@Composable
fun HeroTopBar(){
    Box(Modifier.fillMaxWidth().background(MaterialTheme.colors.background).padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
        Text(
            text = "Superheroes",
            style = MaterialTheme.typography.h3,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HeroesAppTheme() {
        HeroesApp()
    }
}