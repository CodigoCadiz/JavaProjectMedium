//would you survive a zombie apocalypse.
//https://blog.oup.com/2017/10/survive-zombie-apocalypse-quiz/
//https://brainfall.com/quizzes/how-long-would-you-survive-a-zombie-apocalypse/5/?_=MT0xJjI9MDAmMz0uNzUmND0x
//
//import sun.util.resources.en.CurrencyNames_en_ZA;

public class Question {

    public String[] question = new String[10];
    public String[] response = new String[10];
    public int[] userInput = new int[10];
    public String name;


    public Question(String name) {
        this.name = name;
        makeQuestion();
        recordResponses();
    }

    public void makeQuestion() {
        question[0] = "The zombie apocalypse has begun. What do you do first?";
        question[1] = "Where do you go to find shelter?";
        question[2] = "Who do you team up with?";
        question[3] = "What is your go-to survival tactic?";
        question[4] = "Your current hideout has been overrun and you are forced to move locations. Besides your weapon, what other essential item do you bring with you?";
        question[5] = "A horde of zombies are chasing you and grab one of your companions. What do you do?";
        question[6] = "As you are running, the reanimated corpse of a loved one suddenly appears and lunges at you. How do you respond?";
        question[7] = "You notice another group of survivors in the distance. What is your first reaction?";
        question[8] = "What's most important to you?";
        question[9] = "What's your strategy for this whole zombie apocalypse situation?";
    }

    public void recordResponses() {
        response[0] = "a: Flee immediately.     b: Search for Survivors nearby.    c:Make sure your loved ones are accounted for.    d: Barricade your house and hide in your attic. ";
        response[1] = "a: The nearby countryside    b: A basement    c: A supermarket     d: An army base";
        response[2] = "a: No one   b: Your best friend    c: A group of seemingly capable strangers     d: Your family";
        response[3] = "a: Mimic zombie behavior    b: Kill as many zombies as you can   c: Keep moving to new territory   d: Self-isolation";
        response[4] = "a: A box of energy bars   b: A first-aid kit   c: A gallon of water    d: A cell phone";
        response[5] = "a: Panic   b: Double-back after you have reached safety to search for them    c: Shoot them so they don't have to suffer   d: Keep running";
        response[6] = "a: Try to reason with them    b: Fight them off so you can escape without killing them    c: Let one your companions kill them    d: Immediately kill them yourself";
        response[7] = "a: Sneak up on them and steal their supplies    b: Immediately team up with them    c: Avoid them    d: Approach them cautiously, prepared for any hostility";
        response[8] = "a: My stuff   b: My freedom   c: My friends and families    d: My health";
        response[9] = "a: I kill zombies left and right(all zombies will die sooner or later)   b: I just live in the moment    c: I want to find a cure    d: I look for the armed forces so I can be protected";
    }

    public void compile() {

        int sum = 0;
        for (int k = 0; k < question.length; k++) {
            sum += userInput[k];
        }

        int survival = sum ;
        System.out.println("You scored a " + survival + ".");

        if (survival > 20 && survival <= 40){
            System.out.println("Congratulations" + name + "!" + " Due to your excellent survival skills and quick instincts, you will successfully avoid joining the ranks of the undead.");
        }
        if (survival < 20 && survival > 0 ){
            System.out.println("Sorry " + name + ", you will die! Enjoy you're time left :( ");
        }
        if(survival > 40 || survival <= 0){
            System.out.println("Invalid number responses. Remember, numbers only 1-4 !!!");
        }
        if(survival == 20){
            System.out.println("You BARELY escaped, you fought hard and persevered through many challenges but you are badly injured.");
        }
//        if(userInput > 4){
//            System.out.println("");
//        }

    }

}


// I myself ranked the answers from best to worst.
// a being the lowest score possible (worst possible answer) and d being the best possible answer.