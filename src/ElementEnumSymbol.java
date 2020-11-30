public enum ElementEnumSymbol {
    HELIUM("He","Gas"),
    MAGENESIUM("Mg","Solid");
    private String chemicalSymbol;
    private String nature;
    private ElementEnumSymbol(String newChemicalSymbol, String newNature){
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }
    public String chemicalSymbol(){
        return chemicalSymbol;
    }
    public String nature(){
        return nature;
    }

    public static void main(String[] args) {
        System.out.printf("%s,%s,%s", ElementEnumSymbol.HELIUM.toString(), ElementEnumSymbol.HELIUM.chemicalSymbol(), ElementEnumSymbol.HELIUM.nature());
        System.out.println(ElementEnumSymbol.HELIUM);
        if("a".equals(ElementEnumSymbol.HELIUM)){

        }
    }

}
