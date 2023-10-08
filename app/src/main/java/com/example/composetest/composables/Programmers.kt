package com.example.composetest.composables



import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun ListItem(text: String = "blueprint"){

    val isChecked = remember{mutableStateOf(false)}



    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .background(Color.Cyan)
            .padding(10.dp)
            .clickable { }

    ) {

        Checkbox(checked = isChecked.value, onCheckedChange = {isChecked.value = !isChecked.value} )

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1F)
        ){
            Text(text = text, style=MaterialTheme.typography.bodyLarge)
            Text(text = "Kotlin", style=MaterialTheme.typography.bodySmall)
        }

    }


}

@Composable
public fun Programmer(text: String = "Java") {

    LazyColumn {
        item {
            ListItem("Pablo")
        }
        item {
            ListItem("Bobah")
        }
        item {
            ListItem("ladik")
        }
    }
    // LazyRow, LazyColumn

}


@Preview
@Composable
fun ProgrammerPreviewI(){
    Programmer(text = "PreviewingI")
}