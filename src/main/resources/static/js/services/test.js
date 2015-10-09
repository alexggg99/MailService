function DeQueue() {
    this.dataStore = [];
    this.enqueue = enqueue;
    this.dequeue = dequeue;
    this.front = front;
    this.back = back;
    this.toString = toString;
    this.empty = empty;
    this.put = put;
    this.remove = remove;
}
function enqueue(element) {
    this.dataStore.push(element);
}
function dequeue() {
    var priority = this.dataStore[0].code;
    for (var i = 1; i < this.dataStore.length; ++i) {
        if (this.dataStore[i].code > priority) {
            priority = i;
        }
    }
    return this.dataStore.splice(priority,1);
}
function put(element){
    var dataStoreCopy = this.dataStore.slice();
    this.dataStore[0] = element;
    var length = this.dataStore.length;
    for(var i = 1; i<=length; i++){
        this.dataStore[i] = dataStoreCopy[i-1];
    }

}
function remove(){
    return this.dataStore.pop();
}
function front() {
    return this.dataStore[0];
}
function back() {
    return this.dataStore[this.dataStore.length-1];
}
function toString() {
    var retStr = "";
    for (var i = 0; i < this.dataStore.length; ++i) {
        retStr += this.dataStore[i] + "\n";
    }
    return retStr;
}
function empty() {
    if (this.dataStore.length == 0) {
        return true;
    }else {
        return false;
    }
}


function Patient(name, code) {
    this.name = name;
    this.code = code;
}

// test program
var p = new Patient("Smith",5);
var ed = new DeQueue();
ed.enqueue(p);
p = new Patient("Jones", 4);
ed.enqueue(p);
p = new Patient("Fehrenbach", 6);
ed.enqueue(p);
p = new Patient("Brown", 1);
ed.enqueue(p);
p = new Patient("Ingram", 1);
ed.enqueue(p);
print(ed.toString());


function PhoneBook() {
    this.datastore = new Object();
}

PhoneBook.prototype.add = function (key) {
    if(this.datastore[key]){
        //var value = this.datastore[key];
        this.datastore[key]++
    }else{
        this.datastore[key] = 1;
    }
}

PhoneBook.prototype.readLine = function(lineString){
    var tagList = lineString.split(/[\s,-]+/);
    console.log(tagList)
    for(var word in tagList){
        //console.log(tagList[word]);
        this.add(tagList[word])
    }

}

PhoneBook.prototype.find = function(key) {
    return this.datastore[key];
}

PhoneBook.prototype.remove = function(key) {
    delete this.datastore[key];
}

PhoneBook.prototype.showAll = function() {
    for (var key in this.datastore) {
        console.log(key, this.datastore[key]);
    }
}

PhoneBook.prototype.showAllOrdered = function(){
    var a = [];
    for (var key in this.datastore) {
        a.push(key);
    }
    a.sort(function(a,b){
        if(a>b) return 1;
        if(a<b) return -1;
        else return 0;
    })
    for(var value in a){
        console.log(a[value])
    }
}

PhoneBook.prototype.count = function() {
    var n = 0;
    for (var key in Object.keys(this.datastore)) {
        ++n;
    }
    return n;
}

PhoneBook.prototype.clear = function() {
    for (var key in this.datastore) {
        delete this.datastore[key];
    }
}



var phone = new PhoneBook();
phone.add('Alex Gash',89818924043);
phone.add('Misha Vagin',89117431321);
phone.add('APost Bin',89818924043);
phone.add('Nbggj 123',89818924043);
phone.add('Kate Moss',89818924043);

console.log(phone);
