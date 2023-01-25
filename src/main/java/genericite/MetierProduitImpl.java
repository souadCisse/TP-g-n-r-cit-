package genericite;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> products=new ArrayList<>();
    @Override
    public void add(Produit o) {
        Produit p=findById(o.getId());
        if(p==null){
            this.products.add(o);
    }else {
        System.out.println("cet id existe deja");
    }
    }

    @Override
    public List<Produit> getAll() {
        return this.products;
    }



    @Override
    public Produit findById(Long id) {
        for (Produit p:products) {
            if (p.getId()==id){

                return p;}
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Produit p=findById(id);
        if (p!=null)
            products.remove(p);

    }
}
