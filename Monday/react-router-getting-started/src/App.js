import React from "react";
import { HashRouter as Router, Switch, Route, NavLink } from "react-router-dom";
import "./style2.css";

export default function BasicExample() {
  return (
    <Router>
      <div>
        <ul className="header">
          <li>
            <NavLink exact activeClassName="selected" to="/">
              Home
            </NavLink>
          </li>
          <li>
            <NavLink exact activeClassName="selected" to="/exercise1">
              exercise1
            </NavLink>
          </li>
          <li>
            <NavLink exact activeClassName="selected" to="/exercise2">
              exercise2
            </NavLink>
          </li>
        </ul>

        <hr />

        {}
        <div className="content">
          <Switch>
            <Route exact path="/">
              <Home />
            </Route>
            <Route path="/about">
              <About />
            </Route>
            <Route path="/dashboard">
              <Dashboard />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  );
}

// You can think of these components as "pages"
// in your app.

function Home() {
  return (
    <div>
      <h2>Home</h2>
    </div>
  );
}

function About() {
  return (
    <div>
      <h2>About</h2>
    </div>
  );
}

function Dashboard() {
  return (
    <div>
      <h2>Dashboard</h2>
    </div>
  );
}
