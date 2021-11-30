
let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

setPageTitle();
displayGroceries();



document.addEventListener('DOMContentLoaded', () => 
{
  // Register all of your event listeners here
  
  const listItem = document.querySelectorAll("li")
  const checkCircle = document.querySelectorAll(".far")

  for (let i = 0; i < listItem.length; i++) {
    listItem[i].addEventListener('click', () => {
      const element = listItem[i]; 
      if (listItem[i].classList.contains('completed') === false){
      listItem[i].classList.add('completed');
      checkCircle[i].classList.add('completed');}
    })
  }

  for (let i = 0; i < listItem.length; i++) {
    listItem[i].addEventListener('dblclick', () => {
      const element = listItem[i]; 
      if (listItem[i].classList.contains('completed') === true){  
      listItem[i].classList.remove('completed');
      checkCircle[i].classList.remove('completed');}
    })
  }
 
  const button = document.querySelector('.btn')
 
  //mark all as complete
  button.addEventListener('click', () => {
    if (allItemsIncomplete === true) {
      for (let i = 0; i < listItem.length; i++) {
        listItem[i].classList.add('completed');
        checkCircle[i].classList.add('completed');
      }
      allItemsIncomplete = false;
      button.innerText = "Mark All Incomplete";
    } else {
      for (let i = 0; i < listItem.length; ++i) {
        listItem[i].classList.remove('completed');
        checkCircle[i].classList.remove('completed');
      }
      allItemsIncomplete = true;
      button.innerText = "Mark All Complete";
    }
  })
});