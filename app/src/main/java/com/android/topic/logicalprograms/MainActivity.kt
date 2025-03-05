package com.android.topic.logicalprograms

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import com.android.topic.logicalprograms.databinding.ActivityMainBinding
import com.android.topic.logicalprograms.ui.theme.LogicalProgramsTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {

            val data1 = launch{getData1()}.join()
            val data2 = launch { getData2() }.join()
            Log.d("lifecycleScope", "data1 = $data1")
            Log.d("lifecycleScope", "data2 = $data2")

           /* launch {
                val data1 = getData1()
                Log.d("lifecycleScope", "data1 = $data1")
            }

            launch {
                val data2 = getData2()
                Log.d("lifecycleScope", "data2 = $data2")
            }*/
        }
    }
}

suspend fun getData1(): String {
    Log.d("lifecycleScope", "called getData1: ")
    delay(5000)
    return "getData1()"
}


suspend fun getData2(): String {
    Log.d("lifecycleScope", "called getData2: ")
    delay(10000)
    return "getData2()"
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LogicalProgramsTheme {
        Greeting("Android")
    }
}