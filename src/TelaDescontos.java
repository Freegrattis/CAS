public class TelaDescontos {
    /*
     * inserir booleanos para os descontos (tem ou não);
     * do while até o verificador de prontidão ganhar valor true;
     */
    public static Double selecionarDescontos() {        
        boolean verificaPronto = false;
        boolean CLT = false;
        boolean INSS = false;
        boolean IRRF = false;
        double salarioBruto = 0;
        double salarioLiquido=0;
        do{
            int opcoesDescontos=EntradaSaida.escolherOpcoesDescontos();
            switch (opcoesDescontos) {
                case 0:
                    CLT = true;
                break;
            
                default:
                break;
            }
        }while(verificaPronto);
        if(CLT){
            INSS = true;
            IRRF = true;
            salarioLiquido = Calculo.descontoINSS(salarioBruto);
            salarioLiquido += Calculo.descontoIRPF(salarioBruto);
        }
        return salarioLiquido;
    }
}
