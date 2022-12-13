package com.example.ds_android.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class PlatDuJour implements Serializable {
    private ArrayList<Recette> recettes;

    public PlatDuJour() {
    this.recettes = new ArrayList<>();
    }

    public int randRecette(ArrayList recettes){
        int max = recettes.size();
        Random rand = new Random();
        int randRecette = rand.nextInt(max);
        return randRecette;
    }

    public ArrayList<Recette> getRecettes() {
        return recettes;
    }

    public ArrayList<Recette> getTypeRecettes(String categorie){
        ArrayList list = new ArrayList();
        for(Recette uneRecette : recettes){
            if(recettes.contains(categorie))
                list.add(uneRecette);
        }
        return  list;
    }

    public void setRecettes(){
        Ingredient un = new Ingredient("beurre", "500g");
        Ingredient un1 = new Ingredient("hgds", "50g");
        Ingredient un2 = new Ingredient("hgkjh", "0g");
        Ingredient un3 = new Ingredient("tomate", "2");
        Ingredient un4 = new Ingredient("beurre", "500g");
        Ingredient un5 = new Ingredient("nnlnkm", "500g");
        ArrayList Ing = new ArrayList();Ing.add(un); Ing.add(un1); Ing.add(un);Ing.add(un2);Ing.add(un);
        ArrayList Ing2 = new ArrayList(); Ing.add(un); Ing.add(un1); Ing.add(un2);Ing.add(un2);Ing.add(un4);
        ArrayList Ing3 = new ArrayList(); Ing.add(un4); Ing.add(un5); Ing.add(un2);Ing.add(un3);Ing.add(un4);
        recettes.add(new Recette(Ing, "Gaspacho", "Ideoque fertur neminem aliquando ob haec vel similia poenae addictum oblato de more elogio revocari iussisse, quod inexorabiles quoque principes factitarunt. et exitiale hoc vitium, quod in aliis non numquam intepescit, in illo aetatis progressu effervescebat, obstinatum eius propositum accendente adulatorum cohorte.\n" +
                "\n" +
                "Et quoniam apud eos ut in capite mundi morborum acerbitates celsius dominantur, ad quos vel sedandos omnis professio medendi torpescit, excogitatum est adminiculum sospitale nequi amicum perferentem similia videat, additumque est cautionibus paucis remedium aliud satis validum, ut famulos percontatum missos quem ad modum valeant noti hac aegritudine colligati, non ante recipiant domum quam lavacro purgaverint corpus. ita etiam alienis oculis visa metuitur labes.", new CategorieRecette("Froide")));

        recettes.add(new Recette(Ing2, "Pâtes Bolognaise", "Cum saepe multa, tum memini domi in hemicyclio sedentem, ut solebat, cum et ego essem una et pauci admodum familiares, in eum sermonem illum incidere qui tum forte multis erat in ore. Meministi enim profecto, Attice, et eo magis, quod P. Sulpicio utebare multum, cum is tribunus plebis capitali odio a Q. Pompeio, qui tum erat consul, dissideret, quocum coniunctissime et amantissime vixerat, quanta esset hominum vel admiratio vel querella.\n" +
                "\n" +
                "Eodem tempore etiam Hymetii praeclarae indolis viri negotium est actitatum, cuius hunc novimus esse textum. cum Africam pro consule regeret Carthaginiensibus victus inopia iam lassatis, ex horreis Romano populo destinatis frumentum dedit, pauloque postea cum provenisset segetum copia, integre sine ulla restituit mora.", new CategorieRecette("Chaude")));
        recettes.add(new Recette(Ing3, "Garlic Bread", "Eodem tempore etiam Hymetii praeclarae indolis viri negotium est actitatum, cuius hunc novimus esse textum. cum Africam pro consule regeret Carthaginiensibus victus inopia iam lassatis, ex horreis Romano populo destinatis frumentum dedit, pauloque postea cum provenisset segetum copia, integre sine ulla restituit mora.\n" +
                "\n" +
                "Verum ad istam omnem orationem brevis est defensio. Nam quoad aetas M. Caeli dare potuit isti suspicioni locum, fuit primum ipsius pudore, deinde etiam patris diligentia disciplinaque munita. Qui ut huic virilem togam deditšnihil dicam hoc loco de me; tantum sit, quantum vos existimatis; hoc dicam, hunc a patre continuo ad me esse deductum; nemo hunc M. Caelium in illo aetatis flore vidit nisi aut cum patre aut mecum aut in M. Crassi castissima domo, cum artibus honestissimis erudiretur.", new CategorieRecette("Snack")));
    }
}
