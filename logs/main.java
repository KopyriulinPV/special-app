public class main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст


        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }
                System.out.println("Minimal age: " + min);


        if ((vasyaAge <= katyaAge && vasyaAge >= mishaAge) || (vasyaAge <= mishaAge && vasyaAge >= katyaAge)) {
            middle = vasyaAge;
        } else if ((katyaAge <= vasyaAge && katyaAge >= mishaAge) || (katyaAge <= mishaAge && katyaAge >= vasyaAge)) {
            middle = katyaAge;
        } else if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) || (mishaAge <= katyaAge && mishaAge >= vasyaAge)) {
            middle = mishaAge;
        }
                System.out.println("Middle age: " + middle);


        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;

        }
                System.out.println("Maximal age: " + max);
    }
}
