import java.util.Hashtable;


public class MonsterCache {

	private static Hashtable<String, Monster> monsterMap = new Hashtable<String, Monster>();
	
	public static Monster getMonster(String monsterId){
		Monster cachedMonster = monsterMap.get(monsterId);
		return (Monster) cachedMonster.clone();
	}
	
	public static void loadCache(){
		
		Wolf wolf = new Wolf();
		wolf.setId("1");
		monsterMap.put(wolf.getId(), wolf);
		
		Harpy harpy = new Harpy();
		harpy.setId("2");
		monsterMap.put(harpy.getId(), harpy);

	}
}
