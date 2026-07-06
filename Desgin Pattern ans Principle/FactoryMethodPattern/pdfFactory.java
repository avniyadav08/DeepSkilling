package Desgin Pattern ans Principle.FactoryMethodPattern;

public class pdfFactory extends factory{
    @Override
    public document createDocument(){
        return new pdf();
    }
    
}
