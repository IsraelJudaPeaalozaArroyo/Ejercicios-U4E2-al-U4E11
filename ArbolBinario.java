public class ArbolBinario {
     NodoArbol raiz;
     NodoArbol nom;
    private int altura;
    private int cant;
   
    public ArbolBinario (){
        raiz=null;
        nom=null;
    }
    //insertar nodos
    public void insertar (int info,String nom1)
      {
          NodoArbol nuevo;
          nuevo = new NodoArbol ();
          nuevo.nom=nom1;
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              NodoArbol anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if (info < reco.info)
                      reco = (NodoArbol) reco.izq;
                  else
                      reco = (NodoArbol) reco.der;
              }
              if (info < anterior.info)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
      }
    
            //pre orden
            private void imprimirPre (NodoArbol reco)
             {
                 if (reco != null)
                 {
                     System.out.print(reco.nom + " | ");
                     imprimirPre ((NodoArbol) reco.izq);
                     imprimirPre ((NodoArbol) reco.der);
                 }
             }

            public void imprimirPre ()
            {

                imprimirPre (raiz);
                System.out.println();
            }
      
            //in orden
            private void imprimirEntre (NodoArbol reco)
            {
                if (reco != null)
                {    
                    
                    imprimirEntre ((NodoArbol) reco.izq);
                    System.out.print(reco.nom + " | ");
                    imprimirEntre ((NodoArbol) reco.der);
                   
                }
            }
      
            public void imprimirEntre ()
            {
                imprimirEntre (raiz);
                System.out.println();
            }

            // post orden
            
             private void imprimirPost (NodoArbol reco)
                {
                    if (reco != null)
                    {
                        imprimirPost ((NodoArbol) reco.izq);
                        imprimirPost ((NodoArbol) reco.der);
                        System.out.print(reco.nom + " | ");
                    }
                }


                public void imprimirPost ()
                {
                    imprimirPost (raiz);
                    System.out.println();
                }
            
            
            //altura
                    private void retornarAltura (NodoArbol reco,int nivel)    {
                if (reco != null) {    
                    retornarAltura ((NodoArbol) reco.izq,nivel+1);
                    if (nivel>altura)
                        altura=nivel;
                    retornarAltura ((NodoArbol) reco.der,nivel+1);
                }
            }

            public  int retornarAltura () {
                altura=0;
                retornarAltura (raiz,1);
                return altura;
            }
            
            //cantidad de nodos
            private void cantidad(NodoArbol reco) {
                if (reco!=null) {
                    cant++;
                    cantidad((NodoArbol) reco.izq);
                    cantidad((NodoArbol) reco.der);
                }
            }

            public int cantidad() {
                cant=0;
                cantidad(raiz);
                return cant;
            }
            
            //Mayor
            public void menorValorl() {
        if (raiz!=null) {
            int edad;
            NodoArbol reco=raiz;
            while (reco.der!=null)
                reco=(NodoArbol) reco.der;
            edad=2020-reco.info;
            System.out.println("La persona mas peque;a es: "+reco.nom);
            System.out.println("Con una edad de: "+edad+" a;os");
        }
    }
            
            //menor
            
            public void mayorValorl() {
        if (raiz!=null) {
            int edad;
            NodoArbol reco=raiz;
            while (reco.izq!=null)
                reco=(NodoArbol) reco.izq;
            edad=2020-reco.info;
            System.out.println("La persona mas grande es: "+reco.nom);
            System.out.println("Con una edad de: "+edad+" a;os");
        }
    }
 }
