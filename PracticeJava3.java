public class PracticeJava3{
    public static void main(String[] args){
        Player playerA = new Player(30);//�N���X����C���X�^���XplayerA�𐶐�
        playerA.printHP();
    }

}

class Chara{//�X�[�p�[�N���X
    int hp;
    Chara(int hp){
        this.hp = hp;
    }
    void printHP(){//���\�b�h
        System.out.println("HP��"+ hp);
    }
}

class Player extends Chara{//�q�N���X
    Player(int hp){//�e�N���X�̃����o�[�����̂܂܎g����
        super(hp + 50);
    }
    @Override//�I�[�o�[���C�h���Ă��邱�Ƃ𖾎�
    void printHP(){//���\�b�hprintHP���I�[�o�[���C�h
        System.out.println("Player HP="+ hp);
    }
}
