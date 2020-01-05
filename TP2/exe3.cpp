
#include<stdio.h>
#include <stdlib.h> 
int ** alloue_matrice_zero(int lignes, int colonnes)
{
int i;
int** matrice = calloc(lignes,sizeof(int *));
for (i=0;i<lignes;i++)
matrice[i]= calloc(colonnes,sizeof(int));
return matrice;
}
int ** genere_matrice_identite(int dimension)
{
int i;
int ** identite = alloue_matrice_zero(dimension,dimension);
for (i=0;i<dimension;i++)
identite[i][i]=1;
affiche matrice(identite,dimension,dimension);
return identite;
}

int main(){
	
}
