package game.gamelogic;

public enum Role {
    KILLER("Маньяк, ака Мафия, ака Я говорил тебе, что такое безумие? Беспощадный убийца, злодеус злей этого городка. Его цель - не быть пойманным и исключенным из игры(иначе она будет проиграна), при этом скосив как можно больше других игроков."),
    RESCUER("Лекарь. Пусть у него и небольшая зарплата, зато благородная профессия. Во время фазы ночи он может вылечить одного из жителей, включая себя. Так же он может голосовать во время дневной фазы."),
    CONSTABLE("Констебль - лучший детектив этого городка. Может проверять всех игроков и узнавать интересные подробности их жизни. Он так же может оповещать об этом остальных, в надежде на то, что законопослушные граждане ему поверят, а мафия не отравит его во время командировки. Может голосовать во время дневной фазы, если ему разрешат."),
    CITIZEN("Мирный житель этого городка, спящий ночью со включенным светом, жаждущий поимки мафии и последующей справедливости. Его основная задача - голосовать, когда его просят, не инакомыслить и надеяться, что ночью к его дому не подьедет черный воронок. ");

    private String description;
    Role(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}