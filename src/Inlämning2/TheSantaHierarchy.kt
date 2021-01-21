package Inlämning2

import java.util.Map

/**
 * Created by Lisa Ramel
 * Date: 2021-01-14
 * Time: 14:05
 * Project: FunctionalProgramming
 * Copywrite: MIT
 */

class Employee(name: String, isMyBoss: String) {
    val name = name
        get() = field

    var isMyBoss = isMyBoss
        get() = field
}

fun findNisse(input: String, list: List<Employee>) : List<String>{

    val list2 = mutableListOf<String>()

    fun findHeadOf(names : String, b : Boolean, counter : Int) : List<String>{

        return if(if(input == "Tomten") list2.add("$names\n" + (list.get(counter).isMyBoss))
                else if(counter == 0) return list2 else false) list2
        else findHeadOf(if(list.map { it.name }.contains(input)){ list.get(counter).isMyBoss }
               else { "" } , list2.add(names), counter - 1).distinct()
    }
    return findHeadOf("$input" + "s chefer är: ", false, list.map { it.name }.indexOf(input))
}

fun main() {

    val tomten = Employee("Tomten", "Ho-ho, det är jag som är Big Boss här")
    val glader = Employee("Glader", "Tomten")
    val butter = Employee("Butter", "Tomten")
    val tröger = Employee("Tröger", "Glader")
    val trötter = Employee("Trötter", "Glader")
    val blyger = Employee("Blyger", "Glader")
    val rådjuret = Employee("Rådjuret", "Butter")
    val nyckelpigan = Employee("Nyckelpigan", "Butter")
    val haren = Employee("Haren", "Butter")
    val räven = Employee("Räven", "Butter")
    val skumtomten = Employee("Skumtomten", "Trötter")
    val dammråttan = Employee("Dammråttan", "Skumtomten")
    val gråsuggan = Employee("Gråsuggan", "Räven")
    val myran = Employee("Myran", "Räven")
    val bladlusen = Employee("Bladlusen", "Myran")

    var allEmployees = mutableListOf(tomten, glader, butter, tröger, trötter, blyger,
            rådjuret, nyckelpigan, haren, räven, skumtomten, dammråttan, gråsuggan, myran, bladlusen)

    while(true) {

        println("Vems chefer vill du se?: ")
        var input = readLine()!!.toString().toLowerCase().capitalize()
        println()

        findNisse(input, allEmployees).forEach{ n -> println(n)}
        println()

    }
}