fun BasicCalculator(){
    print("Enter 1st Val: ");
    var x = readLine()!!.toInt();
    print("Enter 2nd Val: ");
    var y = readLine()!!.toInt();
    println("select operation: ");
    println("1: +");
    println("2: -");
    println("3: *");
    println("4: /");
    println("5: %");
    var l = readLine()!!.toInt();
    when (l){
        1 -> print(x+y);
        2 -> print(x-y);
        3 -> print(x*y);
        4 -> print(x/y);
        5 -> print(x%y);
        else -> {
            print("Wrong Input Type");
        }
    }
}

fun main(){
    BasicCalculator();
}
