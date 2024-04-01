package dom;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int eid;

	private List<Integer> list;

	private Set<String> set;

	private Map<Integer, String> map;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
