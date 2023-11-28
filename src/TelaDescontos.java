public class TelaDescontos {
    boolean verificaPronto = false;
    boolean CLT = false;
    boolean INSS = false;
    boolean IRRF = false;
    double salarioBruto = 0;

    /*
        inserir booleanos para os descontos (tem ou não);
        do while até o verificador de prontidão ganhar valor true;
        */
        int opcoesDescontos=EntradaSaida.escolherOpcoesDescontos();
        do{
            switch (opcoesDescontos) {
                case 0:
                    CLT = true;
                    INSS = true;
                    IRRF = true;
                break;
            
                default:
                break;
            }
        }while(verificaPronto);
        if(CLT){
            double salarioLiquido += Calculo.descontoINSS(salarioBruto);
            salarioLiquido += Calculo.descontoIRPF(salarioBruto);
        }
}
