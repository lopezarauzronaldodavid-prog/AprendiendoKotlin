import java.math.BigDecimal
fun main() {
    val impuesto1 = calcularImpuesto(BigDecimal("1000"))
    println("El impuesto de \$1000.00 es $$impuesto1")
    val impuesto2 = calcularImpuesto(BigDecimal("500"))
    println("El impuesto de \$500.00 es $$impuesto2")
}
fun calcularImpuesto(valor: BigDecimal, impuesto: BigDecimal = BigDecimal("16")): BigDecimal {
    var resultado = valor.divide(BigDecimal("100"))
    resultado = resultado.multiply(impuesto)
    return resultado.setScale(2, BigDecimal.ROUND_HALF_UP)
}