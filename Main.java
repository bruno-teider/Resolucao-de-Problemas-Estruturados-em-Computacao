class Main {

  public static int buscaBinariaRecursiva(int dado[], int x, int inf, int sup)  {
    if(inf>sup){
      return -1;
    }
    
    int meio = (inf+sup)/2;
      
    if(x == dado[meio]){
      return meio;
    }
    
    if(x<dado[meio]){
      return buscaBinariaRecursiva(dado, x, inf, meio-1);
    }
    else{
      return buscaBinariaRecursiva(dado, x, meio+1, sup);
    }
  }
  
  public static int buscaBinariaIterativa(int dado[], int x, int inf, int sup){
    while(inf <= sup){
      int meio = (inf + sup) /2;

      if (x == dado[meio]){
        return meio;
      }
      
      else if (x>dado[meio]){
        inf = meio + 1;
      }
        
      else {
        sup = meio;
      }
    }
    return -1;
    
  }
    
  public static void main(String[] args) {
    int dados[] = {10, 20, 30, 40, 50, 80};
    int resultadoRec = buscaBinariaRecursiva(dados, 50, 0, 5);
    System.out.println("Por busca recursiva, o index é: " + resultadoRec);

    int resultadoIter = buscaBinariaIterativa(dados, 50, 0, 5);
    System.out.println("Por busca iterativa, o index é: " + resultadoIter);
  }
}