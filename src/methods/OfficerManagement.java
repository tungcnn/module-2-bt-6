package methods;

import entities.Employee;
import entities.Engineer;
import entities.Officer;
import entities.Worker;

import java.util.ArrayList;

public class OfficerManagement<T extends Officer> implements IMethods<T> {
    ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void show() {
        for (T obj : list) {
            System.out.println(obj.toString());
        }
    }

    @Override
    public T search(String name) {
        for (T obj : list) {
            if (obj.getName().equals(name)) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public void update(T newObj, T oldObj) {
        oldObj.setName(newObj.getName());
        oldObj.setAddress(newObj.getAddress());
        oldObj.setGender(newObj.getGender());
        oldObj.setDateOfBirth(newObj.getDateOfBirth());

        if (oldObj instanceof Worker) {
            ((Worker) oldObj).setLevel(((Worker)newObj).getLevel());
        }
        if (oldObj instanceof Employee) {
            ((Employee) oldObj).setTask(((Employee)newObj).getTask());
        }
        if (oldObj instanceof Engineer) {
            ((Engineer) oldObj).setMajor(((Engineer)newObj).getMajor());
        }
    }

    @Override
    public void remove(T removeObj) {
        for (T obj : list) {
            if (obj.getName().equals(removeObj.getName())) {
                list.remove(obj);
            }
        }
    }
}
