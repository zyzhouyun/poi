package pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNull() {
            addCriterion("classNo is null");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNotNull() {
            addCriterion("classNo is not null");
            return (Criteria) this;
        }

        public Criteria andClassNoEqualTo(String value) {
            addCriterion("classNo =", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotEqualTo(String value) {
            addCriterion("classNo <>", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThan(String value) {
            addCriterion("classNo >", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThanOrEqualTo(String value) {
            addCriterion("classNo >=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThan(String value) {
            addCriterion("classNo <", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThanOrEqualTo(String value) {
            addCriterion("classNo <=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLike(String value) {
            addCriterion("classNo like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotLike(String value) {
            addCriterion("classNo not like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIn(List<String> values) {
            addCriterion("classNo in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotIn(List<String> values) {
            addCriterion("classNo not in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoBetween(String value1, String value2) {
            addCriterion("classNo between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotBetween(String value1, String value2) {
            addCriterion("classNo not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClateacherIsNull() {
            addCriterion("clateacher is null");
            return (Criteria) this;
        }

        public Criteria andClateacherIsNotNull() {
            addCriterion("clateacher is not null");
            return (Criteria) this;
        }

        public Criteria andClateacherEqualTo(String value) {
            addCriterion("clateacher =", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherNotEqualTo(String value) {
            addCriterion("clateacher <>", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherGreaterThan(String value) {
            addCriterion("clateacher >", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherGreaterThanOrEqualTo(String value) {
            addCriterion("clateacher >=", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherLessThan(String value) {
            addCriterion("clateacher <", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherLessThanOrEqualTo(String value) {
            addCriterion("clateacher <=", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherLike(String value) {
            addCriterion("clateacher like", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherNotLike(String value) {
            addCriterion("clateacher not like", value, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherIn(List<String> values) {
            addCriterion("clateacher in", values, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherNotIn(List<String> values) {
            addCriterion("clateacher not in", values, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherBetween(String value1, String value2) {
            addCriterion("clateacher between", value1, value2, "clateacher");
            return (Criteria) this;
        }

        public Criteria andClateacherNotBetween(String value1, String value2) {
            addCriterion("clateacher not between", value1, value2, "clateacher");
            return (Criteria) this;
        }

        public Criteria andInstructorIsNull() {
            addCriterion("instructor is null");
            return (Criteria) this;
        }

        public Criteria andInstructorIsNotNull() {
            addCriterion("instructor is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorEqualTo(String value) {
            addCriterion("instructor =", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotEqualTo(String value) {
            addCriterion("instructor <>", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorGreaterThan(String value) {
            addCriterion("instructor >", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorGreaterThanOrEqualTo(String value) {
            addCriterion("instructor >=", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLessThan(String value) {
            addCriterion("instructor <", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLessThanOrEqualTo(String value) {
            addCriterion("instructor <=", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLike(String value) {
            addCriterion("instructor like", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotLike(String value) {
            addCriterion("instructor not like", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorIn(List<String> values) {
            addCriterion("instructor in", values, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotIn(List<String> values) {
            addCriterion("instructor not in", values, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorBetween(String value1, String value2) {
            addCriterion("instructor between", value1, value2, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotBetween(String value1, String value2) {
            addCriterion("instructor not between", value1, value2, "instructor");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("gradeid is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeid is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeid =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeid <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeid >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeid >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeid <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeid <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeid in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeid not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeid between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeid not between", value1, value2, "gradeid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}