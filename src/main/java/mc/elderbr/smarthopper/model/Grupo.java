package mc.elderbr.smarthopper.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Traducao{

    private int cdGrupo;
    private String dsGrupo;
    private List<Item> listItem;

    public Grupo() {
    }

    public int getCdGrupo() {
        return cdGrupo;
    }

    public void setCdGrupo(int cdGrupo) {
        this.cdGrupo = cdGrupo;
    }

    public String getDsGrupo() {
        return dsGrupo;
    }

    public void setDsGrupo(String dsGrupo) {
        this.dsGrupo = dsGrupo;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    }

    public List<Item> addItem(Item item){
        if(listItem == null){
            listItem = new ArrayList<>();
        }
        listItem.add(item);
        return listItem;
    }

    public boolean contains(Item item) {
        String[] names = item.getDsItem().split(" ");
        if (names.length > 0) {
            for (int i = 0; i < names.length; i++) {
                if (names[0].equalsIgnoreCase(getDsGrupo())) {
                    return true;
                }
            }
        } else {
            if (item.getDsItem().equalsIgnoreCase(getDsGrupo())) {
                return true;
            }
        }
        return false;
    }

}
