class player {
    String name;
    
    void show(){
        System.out.println("Player Name "+ name);
    }
}

class Cricket_player extends player{
    Cricket_player(){
        name="Cricket Player";

    }
}

class football_player extends player{
    football_player(){
        name = "football player";
    }

}

class hockey_player extends player{

    hockey_player(){
        name = "hockey player";
    }
}

class main{
    public static void main(String[] args) {
        Cricket_player c1 = new Cricket_player();
        football_player f1 = new football_player();
        hockey_player h1 = new hockey_player();

        c1.show();
        f1.show();
        h1.show();

    }
}
