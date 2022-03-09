import {ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="jbmovie-nav-content">
          <h1>JBMovie</h1>
          <a href="https://github.com/JeanBauch" target="_blank" rel="noreferrer">
            <div className="jbmovie-contact-container">
              <GithubIcon />
              <p className="jbmovie-contact-link">/JeanBauch</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  )
}

export default Navbar;