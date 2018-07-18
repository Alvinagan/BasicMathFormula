package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.formulaList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvCalculate = rowView.findViewById(R.id.tvCalculate);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);

        FormulaItem currentItem = formulaList.get(position);
        tvCalculate.setText(currentItem.getCalculate());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());

        return rowView;

    }
}
