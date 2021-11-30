
<li v-for="item in groceries" v-bind: key="item.id" v-bind: class="{completed: item.completed}"

@click="changeStatus(item.id,$event)" >
  <input type="checkbox" />

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
  shoppingList.appendChild(heading);
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
document.addEventListener("DOMContentLoaded", () => {
  IntersectionObserver();
  addPageTitle();
  addShoppingList;

  const tasks = document.querySelectorAll(li);

  tasks.forEach((task)) => {

    task.addEventListener('click', () => {
      if (!task, classList.contains('completed')) {
        task.classList.add('completed');
        task.querySelector('i').classList.a
        add('completed');
      }
    });

    task.addEventListener('dblclick', () => {
      if (task.classList.contains('completed')) {
        task.classList.remove('completed');
        task.querySelector('i').classList.remove('completed')
      }
    });
    const completeAll = document.getElementById('btnCompleteAll');
    completeAll.addEventListener('click', () => {
      tasks.forEach((task) => {
        task.completeAll.add('completed');
        task.querySelector('i').classList.add('completed');
      });
    });

  }
});

setPageTitle();
displayGroceries();
