package com.bean.information;

import java.util.ArrayList;
import java.util.List;

public class WorkaccomplishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkaccomplishExample() {
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

        public Criteria andWorkIdIsNull() {
            addCriterion("work_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("work_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Integer value) {
            addCriterion("work_id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Integer value) {
            addCriterion("work_id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Integer value) {
            addCriterion("work_id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Integer value) {
            addCriterion("work_id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Integer> values) {
            addCriterion("work_id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Integer> values) {
            addCriterion("work_id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("work_id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkUrlIsNull() {
            addCriterion("work_url is null");
            return (Criteria) this;
        }

        public Criteria andWorkUrlIsNotNull() {
            addCriterion("work_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUrlEqualTo(String value) {
            addCriterion("work_url =", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlNotEqualTo(String value) {
            addCriterion("work_url <>", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlGreaterThan(String value) {
            addCriterion("work_url >", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("work_url >=", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlLessThan(String value) {
            addCriterion("work_url <", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlLessThanOrEqualTo(String value) {
            addCriterion("work_url <=", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlLike(String value) {
            addCriterion("work_url like", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlNotLike(String value) {
            addCriterion("work_url not like", value, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlIn(List<String> values) {
            addCriterion("work_url in", values, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlNotIn(List<String> values) {
            addCriterion("work_url not in", values, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlBetween(String value1, String value2) {
            addCriterion("work_url between", value1, value2, "workUrl");
            return (Criteria) this;
        }

        public Criteria andWorkUrlNotBetween(String value1, String value2) {
            addCriterion("work_url not between", value1, value2, "workUrl");
            return (Criteria) this;
        }

        public Criteria andFinallDataIsNull() {
            addCriterion("finall_data is null");
            return (Criteria) this;
        }

        public Criteria andFinallDataIsNotNull() {
            addCriterion("finall_data is not null");
            return (Criteria) this;
        }

        public Criteria andFinallDataEqualTo(String value) {
            addCriterion("finall_data =", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataNotEqualTo(String value) {
            addCriterion("finall_data <>", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataGreaterThan(String value) {
            addCriterion("finall_data >", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataGreaterThanOrEqualTo(String value) {
            addCriterion("finall_data >=", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataLessThan(String value) {
            addCriterion("finall_data <", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataLessThanOrEqualTo(String value) {
            addCriterion("finall_data <=", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataLike(String value) {
            addCriterion("finall_data like", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataNotLike(String value) {
            addCriterion("finall_data not like", value, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataIn(List<String> values) {
            addCriterion("finall_data in", values, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataNotIn(List<String> values) {
            addCriterion("finall_data not in", values, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataBetween(String value1, String value2) {
            addCriterion("finall_data between", value1, value2, "finallData");
            return (Criteria) this;
        }

        public Criteria andFinallDataNotBetween(String value1, String value2) {
            addCriterion("finall_data not between", value1, value2, "finallData");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNull() {
            addCriterion("stu_no is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("stu_no is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(Integer value) {
            addCriterion("stu_no =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(Integer value) {
            addCriterion("stu_no <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(Integer value) {
            addCriterion("stu_no >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_no >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(Integer value) {
            addCriterion("stu_no <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("stu_no <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<Integer> values) {
            addCriterion("stu_no in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<Integer> values) {
            addCriterion("stu_no not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(Integer value1, Integer value2) {
            addCriterion("stu_no between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_no not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andReadNoIsNull() {
            addCriterion("read_no is null");
            return (Criteria) this;
        }

        public Criteria andReadNoIsNotNull() {
            addCriterion("read_no is not null");
            return (Criteria) this;
        }

        public Criteria andReadNoEqualTo(Integer value) {
            addCriterion("read_no =", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoNotEqualTo(Integer value) {
            addCriterion("read_no <>", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoGreaterThan(Integer value) {
            addCriterion("read_no >", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_no >=", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoLessThan(Integer value) {
            addCriterion("read_no <", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoLessThanOrEqualTo(Integer value) {
            addCriterion("read_no <=", value, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoIn(List<Integer> values) {
            addCriterion("read_no in", values, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoNotIn(List<Integer> values) {
            addCriterion("read_no not in", values, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoBetween(Integer value1, Integer value2) {
            addCriterion("read_no between", value1, value2, "readNo");
            return (Criteria) this;
        }

        public Criteria andReadNoNotBetween(Integer value1, Integer value2) {
            addCriterion("read_no not between", value1, value2, "readNo");
            return (Criteria) this;
        }

        public Criteria andPomtIsNull() {
            addCriterion("pomt is null");
            return (Criteria) this;
        }

        public Criteria andPomtIsNotNull() {
            addCriterion("pomt is not null");
            return (Criteria) this;
        }

        public Criteria andPomtEqualTo(String value) {
            addCriterion("pomt =", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtNotEqualTo(String value) {
            addCriterion("pomt <>", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtGreaterThan(String value) {
            addCriterion("pomt >", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtGreaterThanOrEqualTo(String value) {
            addCriterion("pomt >=", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtLessThan(String value) {
            addCriterion("pomt <", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtLessThanOrEqualTo(String value) {
            addCriterion("pomt <=", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtLike(String value) {
            addCriterion("pomt like", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtNotLike(String value) {
            addCriterion("pomt not like", value, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtIn(List<String> values) {
            addCriterion("pomt in", values, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtNotIn(List<String> values) {
            addCriterion("pomt not in", values, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtBetween(String value1, String value2) {
            addCriterion("pomt between", value1, value2, "pomt");
            return (Criteria) this;
        }

        public Criteria andPomtNotBetween(String value1, String value2) {
            addCriterion("pomt not between", value1, value2, "pomt");
            return (Criteria) this;
        }

        public Criteria andEvluateIsNull() {
            addCriterion("evluate is null");
            return (Criteria) this;
        }

        public Criteria andEvluateIsNotNull() {
            addCriterion("evluate is not null");
            return (Criteria) this;
        }

        public Criteria andEvluateEqualTo(String value) {
            addCriterion("evluate =", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateNotEqualTo(String value) {
            addCriterion("evluate <>", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateGreaterThan(String value) {
            addCriterion("evluate >", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateGreaterThanOrEqualTo(String value) {
            addCriterion("evluate >=", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateLessThan(String value) {
            addCriterion("evluate <", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateLessThanOrEqualTo(String value) {
            addCriterion("evluate <=", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateLike(String value) {
            addCriterion("evluate like", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateNotLike(String value) {
            addCriterion("evluate not like", value, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateIn(List<String> values) {
            addCriterion("evluate in", values, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateNotIn(List<String> values) {
            addCriterion("evluate not in", values, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateBetween(String value1, String value2) {
            addCriterion("evluate between", value1, value2, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateNotBetween(String value1, String value2) {
            addCriterion("evluate not between", value1, value2, "evluate");
            return (Criteria) this;
        }

        public Criteria andEvluateDataIsNull() {
            addCriterion("evluate_data is null");
            return (Criteria) this;
        }

        public Criteria andEvluateDataIsNotNull() {
            addCriterion("evluate_data is not null");
            return (Criteria) this;
        }

        public Criteria andEvluateDataEqualTo(String value) {
            addCriterion("evluate_data =", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataNotEqualTo(String value) {
            addCriterion("evluate_data <>", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataGreaterThan(String value) {
            addCriterion("evluate_data >", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataGreaterThanOrEqualTo(String value) {
            addCriterion("evluate_data >=", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataLessThan(String value) {
            addCriterion("evluate_data <", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataLessThanOrEqualTo(String value) {
            addCriterion("evluate_data <=", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataLike(String value) {
            addCriterion("evluate_data like", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataNotLike(String value) {
            addCriterion("evluate_data not like", value, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataIn(List<String> values) {
            addCriterion("evluate_data in", values, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataNotIn(List<String> values) {
            addCriterion("evluate_data not in", values, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataBetween(String value1, String value2) {
            addCriterion("evluate_data between", value1, value2, "evluateData");
            return (Criteria) this;
        }

        public Criteria andEvluateDataNotBetween(String value1, String value2) {
            addCriterion("evluate_data not between", value1, value2, "evluateData");
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