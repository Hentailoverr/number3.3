public class Calendar {
    private int mnth;
    private int hun = 0;
    private String vis = "Visokostny";
    private String nvis = "Ne visokostny";

    public void setMnth(int mnth) {
        this.mnth = mnth;
    }

    public int getMnth() {
        boolean b1 = mnth % 100 == 0;
        if (b1 && mnth > 100) {
            int hun = mnth / 100;
            if (hun % 4 == 0) {
                System.out.println(vis);
            } else {
                System.out.println(nvis);
            }
        } else if (mnth % 4 == 0) {
            System.out.println(vis);
        } else {
            System.out.println(nvis);
        }
            return mnth;
    }
}




