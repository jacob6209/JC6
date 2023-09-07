package com.example.jc6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc6.ui.theme.AppGray
import com.example.jc6.ui.theme.AppRed
import com.example.jc6.ui.theme.JC6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppRed)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Box(modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        ) {
                        Image(
                            painter = painterResource(R.drawable.google),
                            contentDescription = "Login by Google",
                            modifier = Modifier
                                .size(30.dp)
                                .background(Color.White)
                                .padding(5.dp)
                                .align(Alignment.Center)
                        )
                    }

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Box(modifier = Modifier
                        .clip(RoundedCornerShape(50))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.facebook),
                            contentDescription = "Login by facebook",
                            modifier = Modifier
                                .size(30.dp)
                                .background(Color.White)
                                .padding(5.dp)
                                .align(Alignment.Center)
                        )
                    }

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Box(modifier = Modifier
                        .clip(RoundedCornerShape(50))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.twitter),
                            contentDescription = "Login by twitter",
                            modifier = Modifier
                                .size(30.dp)
                                .background(Color.White)
                                .padding(5.dp)
                                .align(Alignment.Center)
                        )
                    }

                }
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.90f)
                .clip(RoundedCornerShape(0.dp, 0.dp, 60.dp, 60.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.developer),
                        contentDescription = "developer",
                        modifier = Modifier.fillMaxWidth().fillMaxHeight(0.45f)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Login", fontSize = 28.sp)
                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = userName,
                        onValueChange = { userName = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "UserName")
                        },
                        shape = RoundedCornerShape(50)
                    )
                    OutlinedTextField(
//                        colors = TextFieldDefaults.textFieldColors(
//                            containerColor = AppRed, textColor = Color.Black
//                        ),
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Password")
                        },
                        shape = RoundedCornerShape(50)
                    )
                    Spacer(modifier = Modifier.height(21.dp))

                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .clip(RoundedCornerShape(50)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = AppRed,
                            contentColor = Color.White
                        ),

                        ) {
                        Text(text = "Login")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Forget Password", fontSize = 12.sp, color = AppGray)
                        }

                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Register", fontSize = 12.sp, color = AppGray)
                        }
                    }

                }

            }

        }
    }
}


// First Commit
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JC6Theme {
        MainView()
    }
}