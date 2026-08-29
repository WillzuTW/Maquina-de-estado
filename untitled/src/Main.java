void main() {
    int hunger = 0;
    int fatigue = 0;
    String state = "Working";
    for (int i = 0; i < 50; i++) {
        System.out.println("---------------------------");
        System.out.println("Interação:" + i);
        System.out.println(" ");
        switch (state) {
            case "Working":
                System.out.println("Hora de ir para o trabalho!");
                hunger += 2;
                fatigue += 5;
                if (fatigue > 50) {
                    state = "Slepping";
                } else if (hunger > 10) {
                    state = "Eating";
                } else state = "Working";
                break;

            case "Eating":
                System.out.println("Bateu uma fome...");
                hunger -= 5;
                if (hunger <= 0){
                    hunger = 0;
                    System.out.println("Ufa! Já estou cheio");
                    state = "Working";
                }
                break;

            case "Slepping":
                System.out.println("Bateu um sono...");
                fatigue -= 10;
                hunger += 2;
                if (fatigue <= 0){
                    fatigue = 0;
                    if (hunger <= 10) state = "Working"; else state = "Eating";
                }

        }
        System.out.println(" ");
    }
}
