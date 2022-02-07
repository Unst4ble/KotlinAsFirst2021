package MyFunctions

fun sqrInt(num: Int, degree: Int): Int {
    var res = num
    if (degree == 0) return 1
    for (i in 1 until degree) res*=num
    return res
}