package Inlämning2

/**
 * Created by Lisa Ramel
 * Date: 2021-01-14
 * Time: 14:05
 * Project: FunctionalProgramming
 * Copywrite: MIT
 */

class Employee(val name: String, var isMyBoss: String)


fun findNisse(input: String, list: List<Employee>): List<String> {

    val list2 = mutableListOf<String>()

    fun findHeadOf(names: String, b: Boolean, counter: Int): List<String> {

        return if (when {
            input == "Tomten" -> list2.add("$names\n" + (list.get(counter).isMyBoss))
            counter == -1 -> return list2
            else -> false
        }) list2
        else findHeadOf(if (list.map { it.name }.contains(input)) {
            list.get(counter).isMyBoss
        } else "", list2.add(names), counter - 1).distinct()
    }
    return findHeadOf(input + "s chefer är: ", false, list.map { it.name }.indexOf(input))
}

fun main() {

    val tomten = Employee("Tomten", "Ho-ho, det är jag som är Big Boss här")
    val glader = Employee("Glader", "Tomten")
    val butter = Employee("Butter", "Tomten")
    val troger = Employee("Tröger", "Glader")
    val trotter = Employee("Trötter", "Glader")
    val blyger = Employee("Blyger", "Glader")
    val radjuret = Employee("Rådjuret", "Butter")
    val nyckelpigan = Employee("Nyckelpigan", "Butter")
    val haren = Employee("Haren", "Butter")
    val raven = Employee("Räven", "Butter")
    val skumtomten = Employee("Skumtomten", "Trötter")
    val dammrattan = Employee("Dammråttan", "Skumtomten")
    val grasuggan = Employee("Gråsuggan", "Räven")
    val myran = Employee("Myran", "Räven")
    val bladlusen = Employee("Bladlusen", "Myran")

    val allEmployees = mutableListOf(tomten, glader, butter, troger, trotter, blyger,
            radjuret, nyckelpigan, haren, raven, skumtomten, dammrattan, grasuggan, myran, bladlusen)

    while (true) {

        println("Vems chefer vill du se?: ")
        val input = readLine()!!.toString().toLowerCase().capitalize()
        println()

        findNisse(input, allEmployees).forEach { n -> println(n) }
        println()

    }
}