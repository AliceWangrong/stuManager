package com.bean.information;

import java.util.ArrayList;
import java.util.List;

public class CurriculumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumExample() {
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

        public Criteria andCurrIdIsNull() {
            addCriterion("curr_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrIdIsNotNull() {
            addCriterion("curr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrIdEqualTo(Integer value) {
            addCriterion("curr_id =", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotEqualTo(Integer value) {
            addCriterion("curr_id <>", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThan(Integer value) {
            addCriterion("curr_id >", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_id >=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThan(Integer value) {
            addCriterion("curr_id <", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThanOrEqualTo(Integer value) {
            addCriterion("curr_id <=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdIn(List<Integer> values) {
            addCriterion("curr_id in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotIn(List<Integer> values) {
            addCriterion("curr_id not in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdBetween(Integer value1, Integer value2) {
            addCriterion("curr_id between", value1, value2, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_id not between", value1, value2, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNull() {
            addCriterion("curr_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNotNull() {
            addCriterion("curr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrNameEqualTo(String value) {
            addCriterion("curr_name =", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotEqualTo(String value) {
            addCriterion("curr_name <>", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThan(String value) {
            addCriterion("curr_name >", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThanOrEqualTo(String value) {
            addCriterion("curr_name >=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThan(String value) {
            addCriterion("curr_name <", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThanOrEqualTo(String value) {
            addCriterion("curr_name <=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLike(String value) {
            addCriterion("curr_name like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotLike(String value) {
            addCriterion("curr_name not like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameIn(List<String> values) {
            addCriterion("curr_name in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotIn(List<String> values) {
            addCriterion("curr_name not in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameBetween(String value1, String value2) {
            addCriterion("curr_name between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotBetween(String value1, String value2) {
            addCriterion("curr_name not between", value1, value2, "currName");
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