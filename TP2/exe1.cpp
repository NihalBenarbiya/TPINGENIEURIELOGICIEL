#include<stdio.h>
void affiche_vecteur(int * vecteur, int dimension)
{
int i;
printf("(");
for(i=0;i<dimension;i++)
printf("%d",vecteur[i]);
printf("\n");
}
void affiche_matrice(int ** matrice, int lignes,int colonnes)
{
int i;
for(i=0;i<lignes;i++)
affiche_vecteur(matrice[i],colonnes);
printf("\n");
}

int main(){
}
