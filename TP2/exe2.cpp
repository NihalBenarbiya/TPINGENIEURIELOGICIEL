#include<stdio.h>
#include<malloc.h>
int * alloue_vecteur(int dimension, int val)
{
int i;
int * vecteur = malloc(dimension*sizeof(int));
for(i=0;i<dimension;i++)
vecteur[i]=val;
return vecteur;
}
void libere vecteur(int * vecteur)
{
free(vecteur);
}
