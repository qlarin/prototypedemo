
public class PrototypeTest {

	public static void main(String[] args) {
		MonsterCache.loadCache();
		
		Monster clonedMonster = (Monster) MonsterCache.getMonster("1");
		System.out.println("Monster: " + clonedMonster.getType());
		Monster clonedMonster2 = (Monster) MonsterCache.getMonster("2");
		System.out.println("Monster: " + clonedMonster2.getType());
		Monster clonedMonster3 = (Monster) MonsterCache.getMonster("1");
		System.out.println("Monster: " + clonedMonster3.getType());
	}

}
