import java.util.ArrayList;
import java.util.List;

public class ItemTour {
    public List<Tours> toursList;
    public ItemTour() {
        toursList = new ArrayList<>();
    }
    public void AddTour(Tours tours) {
        toursList.add(tours);
    }
    public Tours FindTourById(int id) {
        for (Tours c : toursList) {
            if (id == c.getId()) {
                return c;
            }
        }
        return null;
    }
    public void SetHot(int id) {
        Tours tours1 = FindTourById(id);
        tours1.setStatus("Hot");
    }
}
