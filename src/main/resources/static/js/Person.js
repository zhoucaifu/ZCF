
function Person(age,name){
	this.sayHello = function(){
		alert("说好")
		
	}
	
}

function Student(score){
	
	this.sayScore = function(){
		alert("说成绩")
	}
}

Student.prototype = new Person();
Student.prototype.bark = function () {
    document.write("Student继承Person<br/>");
}