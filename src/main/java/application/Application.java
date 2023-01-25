package application;

import genericite.MetierProduitImpl;
import genericite.Produit;

import java.util.Scanner;

public class Application {

        public static void main(String[] args) {
            int n; Long id ; String nom; String marque; float prix; String description; int nb_stock;
            MetierProduitImpl products = new MetierProduitImpl();
            Produit p1=new Produit(1l,"prod1","marque1", (float) 12.9,"description1",12);
            products.add(p1);
            do{ System.out.println("1. Afficher la liste des produits.\n" +
                    "2. Rechercher un produit par son id.\n" +
                    "3. Ajouter un nouveau produit dans la liste.\n" +
                    "4. Supprimer un produit par id.\n" +
                    "5. Quitter ce programme.");
                System.out.println("choisi un numero:");

                Scanner sc = new Scanner(System.in);
                n= sc.nextInt();

                switch(n){
                    case 1 :
                        System.out.println(products.getAll());
                        break;
                    case 2:
                        System.out.println("entre id :");
                        Scanner scId = new Scanner(System.in);
                        System.out.println(products.findById(scId.nextLong()).toString());
                        break;
                    case 3:
                        Produit prod = new Produit();

                        System.out.println("entre id :");
                        id = sc.nextLong();
                        prod.setId(id);
                        if(products.findById(id) != null){
                            System.out.println("cet id existe deja");
                            break;
                        }
                        System.out.println("entre le nom de produit :");
                        nom = sc.next();
                        prod.setNom(nom);

                        System.out.println("entre la marque :");
                        marque = sc.next();
                        prod.setMarque(marque);

                        System.out.println("entre le prix :");
                        prix = sc.nextFloat();
                        prod.setPrix(prix);

                        System.out.println("entre la description :");
                        description = sc.next();
                        prod.setDescription(description);

                        System.out.println("entre la qte en stock :");
                        nb_stock = sc.nextInt();
                        prod.setNb_stock(nb_stock);
                        products.add(prod);

                        for (Produit p : products.getAll()) {
                            System.out.println(p);
                        }
                        System.out.println("le produit a ete ajoute avec succes");
                        break;
                    case 4:
                        System.out.println("entre id :");
                        id = sc.nextLong();
                        products.delete(id);
                        break;
                    case 5:
                        System.out.println("Au revoir!");
                        break;
                    default:
                        System.out.println("choisi un autre numero");
                        break;
                }}while (n!=5);


        }



        }


