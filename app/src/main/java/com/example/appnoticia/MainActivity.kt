package com.example.appnoticia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticia.ui.theme.AppnoticiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppnoticiaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}
@Composable
fun App() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Transparent),
            Arrangement.Center
        ) {
            Text(
                text = "AppNoticia",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {
        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "Incêndio em escola")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "incêndio em escola no interior de São Paulo"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {

        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "Conheça o bunker do fim do mundo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "O bunker possui diversas sementes e artigos culturais e é anti bombas nucleares"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {

        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "Descubra como atualizar seu bilhete unico")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Novo modulo do bilhete unico chama atenção para sua nova atualização"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {

        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "As novas receitas do chefe Erick Fogaza")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Novo livro de receitas do renomado chefe Erick Fogaza"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {

        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "Conheça a história de Rasputin")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Conheça Grigori Rasputin, o monge louco da Rússia, o home que sofreu 4 tentativas de assassinato em uma noite"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {

        }

        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Text(text = "O caos na Paraíba")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "situação caótica após acidentes nas principais cidades do estado, causando revolta em moradores"
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            )
            {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia mais")
                }
            }
        }
    }
}
@Preview
@Composable
fun AppPrewview() {
    AppnoticiaTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }

}