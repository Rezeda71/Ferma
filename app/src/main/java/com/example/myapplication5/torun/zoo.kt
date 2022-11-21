package com.example.myapplication.torun
import com.example.myapplication.model.Cornivor
import com.example.myapplication.model.Herbiv

fun main() {
    val cornivor1 = Cornivor(animalName = "Лев", meal = "Мясо")
    println(cornivor1.animalName + " ест " + cornivor1.meal)
    cornivor1.age = 5
    println("Возраст:" + cornivor1.age)

    val cornivor2 = Cornivor(animalName = "Тигр", meal = "Мясо")
    println(cornivor2.animalName)
    println("Ест " + cornivor2.meal)
    val herbiv1 = Herbiv(animalName = "Корова", meal = " траву, ", address = " на ферме ")
    println (herbiv1.animalName + " ест " + herbiv1.meal + "живет" + herbiv1.address)
    val herbiv2 = Herbiv(animalName = "Козел", meal = " траву, ", address = " на ферме")
    println (herbiv2.animalName + " ест " + herbiv2.meal + "живет" + herbiv2.address )
    
    //Вы не добавили списки 
    val herbivoresList: List<Herbiv> = listOf(herbiv1, herbiv2)
    val cornivoresList: List<Cornivor> = listOf(cornivor1, cornivor2) 
    
    
    for(i in 0..herbivoresList.indices)
    {
        println(herbivoresList[i].animalName)
    }
    
    
    
}
