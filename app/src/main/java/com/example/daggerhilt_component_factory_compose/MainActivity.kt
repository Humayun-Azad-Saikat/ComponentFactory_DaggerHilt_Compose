package com.example.daggerhilt_component_factory_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.daggerhilt_component_factory_compose.modules.NotificaionServiceModule
import com.example.daggerhilt_component_factory_compose.ui.theme.DaggerHilt_Component_factory_ComposeTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userResistaionService: UserResistaionService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerHilt_Component_factory_ComposeTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {

//                    val component = DaggerConsumerComponent.builder()
//                        .notificaionServiceModule(NotificaionServiceModule(3))
//                        .build()
                    val component = DaggerConsumerComponent.factory().create(3)
                    component.injectMainAC(this)
                    userResistaionService.resisterUser("","")

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerHilt_Component_factory_ComposeTheme {

    }
}