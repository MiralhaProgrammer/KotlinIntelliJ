fun main() {
endereco("São Jerônimo da Serra", "Guarulhos", "São Paulo", "07132-020") //posso chamar sem o Int pois possui um numero default
endereco(cidade = "Guarulhos", cep = "07132-020", rua = "São jerônimo da Serra", estado = "São paulo") // Desta maneira, é possível colocar os parâmetros fora de ordem
}


fun endereco(rua:String,cidade:String, estado:String, cep: String, num:Int = 0 ){

}