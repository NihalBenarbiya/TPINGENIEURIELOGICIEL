package tp4IG;

public class Entier {
	private int a;
	private short s;
	private long l;
	
	
	
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public short getS() {
		return s;
	}


	public void setS(short s) {
		this.s = s;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}



	/**
	 * 
	 * @param a
	 * @return
	 */
	
	public int fact(int a){
	int fact = 1;
	for(int i = a; i >= 1; i--){
		fact = fact*i;
	}
	System.out.println(fact);
	return a;
	}
	
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	
	public  int pgcd (int a , int b) {
		int t,r;
	    if ( b>a) {
	            t = a;
	            a = b;
	            b = t;
	     }
	    do {
	            r = a % b;
	            a = b;
	            b = r;
	    } while(r !=0);
	   return a ;
	  }
	
	public void pair(int a) {
	 if (a % 2 == 0) {
	      System.out.println("Pair");
	    }
	    if (a % 2 != 0) {
	      System.out.println("Impair");
	    }
	}
	/**
	 * 
	 * @param a
	 * @return
	 */
	public int premier(int a) {
	 int reste;
	  boolean flag = true;       
	  for(int i=2; i <= a/2; i++)
	  {
	     //nombre est divisible par lui-meme
	     reste = a%i;
	            
	     //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
	     if(reste == 0)
	     {
	        flag = false;
	        break;
	     }
	  }
	  //si flag est true, alors nombre est premier, sinon non premier
	  if(flag)
	     System.out.println(a + " est un nombre premier");
	  else
	     System.out.println(a + " n'est pas un nombre premier");
	  
	  return a;
	  }
	

	

}
