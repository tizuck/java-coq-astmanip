package model.tactics.atomic.tacargcomponents;

import model.term.Number;
import model.term.Qualid;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QualidNumsListComponent extends TacArgComponent {

    public class QualidNums {

        private Qualid qualid;

        private List<Number> nums;


        public QualidNums(Qualid qualid, List<Number> nums) {
            this.qualid = qualid;
            this.nums = nums;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            QualidNums that = (QualidNums) o;
            return Objects.equals(qualid, that.qualid) &&
                    Objects.equals(nums, that.nums);
        }

        @Override
        public int hashCode() {
            return Objects.hash(qualid, nums);
        }

        public Qualid getQualid() {
            return qualid;
        }

        public List<Number> getNums() {
            return nums;
        }
    }

    private List<QualidNums> qualidNums;

    public QualidNumsListComponent(List<Qualid> qualids, List<List<Number>> nums) {
        qualidNums = new ArrayList<>();
        for (int i = 0; i < qualids.size(); i++) {
            qualidNums.add(new QualidNums(qualids.get(i),nums.get(i)));
        }
    }

    public QualidNumsListComponent(ComponentType componentType, List<Qualid> qualids, List<List<Number>> nums) {
        super(componentType);
        qualidNums = new ArrayList<>();
        for (int i = 0; i < qualids.size(); i++) {
            qualidNums.add(new QualidNums(qualids.get(i),nums.get(i)));
        }
    }

    public List<QualidNums> getQualidNums() {
        return qualidNums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QualidNumsListComponent that = (QualidNumsListComponent) o;
        return Objects.equals(qualidNums, that.qualidNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qualidNums);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }


}
