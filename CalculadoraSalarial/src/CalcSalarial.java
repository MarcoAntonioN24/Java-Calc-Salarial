/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Etec-User
 */
public class CalcSalarial {
    //ATRIBUTOS ESTATICOS (CONSTANTES)
                        //NOME CONSTANTE LETRA MAIÚSCULA
    private final double DESC_VT = 50;
    private final double DESC_VR = 35.35;
    private final double DESC_PERC_CONV = 7.5;
    private final double ACRES_VA = 300.50;
    private final double ACRES_DEP = 53.99;
    
    
    //ATRIBUTOS DINÂMICOS
    
    private double valorHora,qtdHorasTrab;
    private double salarioBase,salarioLiquido;
    private double totalDependentes = 0;
    private double totalAcrescimos = 0;
    private double totalDescontos = 0;
    
    
    //CONSTRUTOR
    //OBRIGATÓRIO FORNECIMENTO DOS DOIS VALORES AO INSTACIAR OBJETOS DESSA CLASSE!!

    public CalcSalarial(double valorHora, double qtdHorasTrab) {
        
        //INICIALIZANDO OS ATRIBUTOS
        this.valorHora = valorHora;
        this.qtdHorasTrab = qtdHorasTrab;
        
        this.salarioBase = this.qtdHorasTrab*this.valorHora;
        this.salarioLiquido = this.salarioBase;
    }
    
    
    //MÉTODOS

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

   

    public double getTotalAcrescimos() {
        return totalAcrescimos;
    }

    public double getTotalDescontos() {
        return totalDescontos;
    }
    
    public void  AcrescentarDependentes ( int qtdDependentes) {
        
        this.totalDependentes = ACRES_DEP * qtdDependentes ;
        // this.salarioLiquido = this.salarioLiquido + this.totalDependentes;
        this.salarioLiquido  += this.totalDependentes;
        this.totalAcrescimos = this.totalAcrescimos + this.totalDependentes; 
        
    }
    
    public void acrescentarVA (){
    //ACRESCENTANDO CONSTANTE (ACRESC_VA) aos atributos salarioLiquido e totalAcrescimos
    this.salarioLiquido += ACRES_VA;
    this.totalAcrescimos += ACRES_VA;
    
    }   
    
    public void descontarVT (){
    this.salarioLiquido -= DESC_VT;
    this.totalDescontos += DESC_VT;
    }
    
    public void descontarVR (){
    this.salarioLiquido -= DESC_VR;
    this.totalDescontos += DESC_VR;
    }
    
    public void descontarCONV (){
    double percValor = (DESC_PERC_CONV * this.salarioLiquido)/100 ;   
    this.salarioLiquido -= percValor;
    this.totalDescontos += percValor;

    }
}
